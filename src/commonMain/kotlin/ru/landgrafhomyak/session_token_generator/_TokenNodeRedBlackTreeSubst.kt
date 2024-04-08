package ru.landgrafhomyak.session_token_generator

import ru.landgrafhomyak.collections.AbstractRedBlackTree

@Suppress("ClassName")
internal class _TokenNodeRedBlackTreeSubst : AbstractRedBlackTree<_CommonTokenNode>() {
    override fun _getColor(node: _CommonTokenNode): Color =
        node.dict_color

    override fun _getLeftChild(node: _CommonTokenNode): _CommonTokenNode? =
        node.dict_left

    override fun _getParent(node: _CommonTokenNode): _CommonTokenNode? =
        node.dict_parent

    override fun _getRightChild(node: _CommonTokenNode): _CommonTokenNode? =
        node.dict_right

    override fun _setColor(node: _CommonTokenNode, color: Color) {
        node.dict_color = color
    }

    override fun _setLeftChild(node: _CommonTokenNode, child: _CommonTokenNode?) {
        node.dict_left = child
    }

    override fun _setParent(node: _CommonTokenNode, parent: _CommonTokenNode?) {
        node.dict_parent = parent
    }

    override fun _setRightChild(node: _CommonTokenNode, child: _CommonTokenNode?) {
        node.dict_right = child
    }
}