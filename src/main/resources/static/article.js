// 삭제 기능 구현
const deleteButton = document.getElementById('delete-btn');

if (deleteButton) {
    deleteButton.addEventListener('click', event => {
        let id = document.getElementById('article-id').value;
        fetch(`/api/articles/${id}`, {
            method: 'DELETE'
        })
            .then(response => {
                if (response.ok) {
                    return response.json();
                }
                throw new Error('삭제 요청에 실패했습니다.');
            })
            .then(data => {
                alert('삭제가 완료되었습니다.');
                location.replace('/articles');
            })
            .catch(error => {
                console.error('Error:', error);
                alert('삭제 요청에 실패했습니다.');
            });
    });
}