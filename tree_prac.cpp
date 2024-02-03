#include <iostream>
using namespace std;

// Binary Search Tree (BST) Node
struct Node {
    int val;
    Node* left;
    Node* right;
};

// Insert a node into the BST
Node* insert(Node* root, int key) {
    // Create a new node if the root is null
    if (root == NULL) {
        Node* node = new Node;
        node->val = key;
        node->left = NULL;
        node->right = NULL;
        return node;
    }

    // Recursively insert a new node to the left or right
    if (key < root->val) {
        root->left = insert(root->left, key);
    }
    else if (key > root->val) {
        root->right = insert(root->right, key);
    }

    // Return the root node
    return root;
}

// Delete a node from the BST
Node* delete_node(Node* root, int key) {
    if (root == NULL) {
        return root;
    }

    if (key < root->val) {
        root->left = delete_node(root->left, key);
    }
    else if (key > root->val) {
        root->right = delete_node(root->right, key);
    }
    else {
        // Case 1: Node has no children
        if (root->left == NULL && root->right == NULL) {
            root = NULL;
        }
        // Case 2: Node has one child
        else if (root->left == NULL) {
            root = root->right;
        }
        else if (root->right == NULL) {
            root = root->left;
        }
        // Case 3: Node has two children
        else {
            Node* temp = root->right;
            while (temp->left != NULL) {
                temp = temp->left;
            }
            root->val = temp->val;
            root->right = delete_node(root->right, temp->val);
        }
    }

    return root;
}

// Traverse the BST in preorder
void preorder(Node* root) {
    if (root != NULL) {
        cout << root->val << " ";
        preorder(root->left);
        preorder(root->right);
    }
}

// Traverse the BST in inorder
void inorder(Node* root) {
    if (root != NULL) {
        inorder(root->left);
        cout << root->val << " ";
        inorder(root->right);
    }
}

// Traverse the BST in postorder
void postorder(Node* root) {
    if (root != NULL) {
        postorder(root->left);
        postorder(root->right);
        cout << root->val << " ";
    }
}

// Search for a node in the BST
Node* search(Node* root, int key) {
    if (root == NULL || root->val == key) {
        return root;
    }

    if (key < root->val) {
        return search(root->left, key);
    }
    else {
        return search(root->right, key);
    }
}

// Main method
int main() {
    Node* root = NULL;
    cout<<"Enter the size: ";
    int n;
    cin>>n;
    for (int i = 0; i < n; i++)
    {
        int p;
        cin>>p;
        root = insert(root, p);
    }
    

     // Delete node 50 from the BST
    //root = delete_node(root, 50);

    // Insert node 1 into the BST
   // root = insert(root, 1);

    // Traverse the BST in preorder
    cout << "Preorder traversal: ";
    preorder(root);
    cout << endl;

    // Traverse the BST in inorder
    cout << "Inorder traversal: ";
    inorder(root);
    cout << endl;

    // Traverse the BST in postorder
    cout << "Postorder traversal: ";
    postorder(root);
    cout << endl;

    // Search for a node in the BST
    Node* node = search(root, 40);
    if (node != NULL) {
        cout << "Node found: " << node->val << endl;
    }
    else {
        cout << "Node not found." << endl;
    }

    // Traverse the
}