const todoInput = document.getElementById('todoInput');
const addButton = document.getElementById('addButton');
const todoList = document.getElementById('todoList');

addButton.addEventListener('click', () => {
    const todoText = todoInput.value.trim();
    if (todoText) {
        addTodoItem(todoText);
        todoInput.value = '';
    }
});

todoInput.addEventListener('keypress', (e) => {
    if (e.key === 'Enter') {
        addButton.click();
    }
});

function addTodoItem(text, isEditing = false) {
    const li = document.createElement('li');
    li.className = 'todo-item';

    const todoContent = document.createElement('span');
    todoContent.textContent = text;

    const actions = document.createElement('div');
    actions.className = 'todo-actions';

    const editButton = document.createElement('button');
    editButton.className = 'edit-btn';
    editButton.textContent = 'Edit';

    const deleteButton = document.createElement('button');
    deleteButton.className = 'delete-btn';
    deleteButton.textContent = 'Delete';

    deleteButton.addEventListener('click', () => {
        li.remove();
    });

    editButton.addEventListener('click', () => {
        const newText = prompt('Edit your todo:', text);
        if (newText !== null && newText.trim() !== '') {
            todoContent.textContent = newText.trim();
        }
    });

    actions.appendChild(editButton);
    actions.appendChild(deleteButton);
    li.appendChild(todoContent);
    li.appendChild(actions);
    todoList.appendChild(li);

    if (isEditing) {
        editButton.click();
    }
}
