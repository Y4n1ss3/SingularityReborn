package androidx.compose.ui.graphics;

import defpackage.ky;
import defpackage.ti;
import defpackage.ui;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IntervalTree<T> {
    public static final int $stable = 8;
    public IntervalTree<T>.Node root;
    public final ArrayList<IntervalTree<T>.Node> stack;
    public final IntervalTree<T>.Node terminator;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class Node extends Interval<T> {
        private int color;
        private IntervalTree<T>.Node left;
        private float max;
        private float min;
        private IntervalTree<T>.Node parent;
        private IntervalTree<T>.Node right;

        public Node(float f, float f2, T t, int i) {
            super(f, f2, t);
            this.color = i;
            this.min = f;
            this.max = f2;
            IntervalTree<T>.Node node = IntervalTree.this.terminator;
            this.left = node;
            this.right = node;
            this.parent = node;
        }

        public final int getColor() {
            return this.color;
        }

        public final IntervalTree<T>.Node getLeft() {
            return this.left;
        }

        public final float getMax() {
            return this.max;
        }

        public final float getMin() {
            return this.min;
        }

        public final IntervalTree<T>.Node getParent() {
            return this.parent;
        }

        public final IntervalTree<T>.Node getRight() {
            return this.right;
        }

        public final IntervalTree<T>.Node lowestNode() {
            Node node = this;
            while (true) {
                IntervalTree<T>.Node node2 = node.left;
                if (node2 == IntervalTree.this.terminator) {
                    return node;
                }
                node = node2;
            }
        }

        public final IntervalTree<T>.Node next() {
            IntervalTree<T>.Node node = this.right;
            if (node != IntervalTree.this.terminator) {
                return node.lowestNode();
            }
            IntervalTree<T>.Node node2 = this.parent;
            Node node3 = this;
            while (node2 != IntervalTree.this.terminator && node3 == node2.right) {
                node3 = node2;
                node2 = node2.parent;
            }
            return node2;
        }

        public final void setColor(int i) {
            this.color = i;
        }

        public final void setLeft(IntervalTree<T>.Node node) {
            this.left = node;
        }

        public final void setMax(float f) {
            this.max = f;
        }

        public final void setMin(float f) {
            this.min = f;
        }

        public final void setParent(IntervalTree<T>.Node node) {
            this.parent = node;
        }

        public final void setRight(IntervalTree<T>.Node node) {
            this.right = node;
        }
    }

    public IntervalTree() {
        IntervalTree<T>.Node node = new Node(Float.MAX_VALUE, Float.MIN_VALUE, null, 1);
        this.terminator = node;
        this.root = node;
        this.stack = new ArrayList<>();
    }

    public static /* synthetic */ Interval findFirstOverlap$default(IntervalTree intervalTree, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return intervalTree.findFirstOverlap(f, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOverlaps$default(IntervalTree intervalTree, float f, float f2, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        if ((i & 4) != 0) {
            list = new ArrayList();
        }
        return intervalTree.findOverlaps(f, f2, list);
    }

    public static /* synthetic */ void forEach$ui_graphics$default(IntervalTree intervalTree, float f, float f2, ky kyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        IntervalTree<T>.Node node = intervalTree.root;
        if (node != intervalTree.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = intervalTree.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node remove = arrayList.remove(arrayList.size() - 1);
                if (remove.overlaps(f, f2)) {
                    kyVar.invoke(remove);
                }
                if (remove.getLeft() != intervalTree.terminator && remove.getLeft().getMax() >= f) {
                    arrayList.add(remove.getLeft());
                }
                if (remove.getRight() != intervalTree.terminator && remove.getRight().getMin() <= f2) {
                    arrayList.add(remove.getRight());
                }
            }
            arrayList.clear();
        }
    }

    private final void rebalance(IntervalTree<T>.Node node) {
        while (node != this.root && node.getParent().getColor() == 0) {
            IntervalTree<T>.Node parent = node.getParent().getParent();
            if (node.getParent() == parent.getLeft()) {
                IntervalTree<T>.Node right = parent.getRight();
                if (right.getColor() == 0) {
                    right.setColor(1);
                    node.getParent().setColor(1);
                    parent.setColor(0);
                    node = parent;
                } else {
                    if (node == node.getParent().getRight()) {
                        node = node.getParent();
                        rotateLeft(node);
                    }
                    node.getParent().setColor(1);
                    parent.setColor(0);
                    rotateRight(parent);
                }
            } else {
                IntervalTree<T>.Node left = parent.getLeft();
                if (left.getColor() == 0) {
                    left.setColor(1);
                    node.getParent().setColor(1);
                    parent.setColor(0);
                    node = parent;
                } else {
                    if (node == node.getParent().getLeft()) {
                        node = node.getParent();
                        rotateRight(node);
                    }
                    node.getParent().setColor(1);
                    parent.setColor(0);
                    rotateLeft(parent);
                }
            }
        }
        this.root.setColor(1);
    }

    private final void rotateLeft(IntervalTree<T>.Node node) {
        IntervalTree<T>.Node right = node.getRight();
        node.setRight(right.getLeft());
        if (right.getLeft() != this.terminator) {
            right.getLeft().setParent(node);
        }
        right.setParent(node.getParent());
        if (node.getParent() == this.terminator) {
            this.root = right;
        } else if (node.getParent().getLeft() == node) {
            node.getParent().setLeft(right);
        } else {
            node.getParent().setRight(right);
        }
        right.setLeft(node);
        node.setParent(right);
        updateNodeData(node);
    }

    private final void rotateRight(IntervalTree<T>.Node node) {
        IntervalTree<T>.Node left = node.getLeft();
        node.setLeft(left.getRight());
        if (left.getRight() != this.terminator) {
            left.getRight().setParent(node);
        }
        left.setParent(node.getParent());
        if (node.getParent() == this.terminator) {
            this.root = left;
        } else if (node.getParent().getRight() == node) {
            node.getParent().setRight(left);
        } else {
            node.getParent().setLeft(left);
        }
        left.setRight(node);
        node.setParent(left);
        updateNodeData(node);
    }

    private final void updateNodeData(IntervalTree<T>.Node node) {
        while (node != this.terminator) {
            node.setMin(Math.min(node.getStart(), Math.min(node.getLeft().getMin(), node.getRight().getMin())));
            node.setMax(Math.max(node.getEnd(), Math.max(node.getLeft().getMax(), node.getRight().getMax())));
            node = node.getParent();
        }
    }

    public final void addInterval(float f, float f2, T t) {
        IntervalTree<T>.Node node = new Node(f, f2, t, 0);
        IntervalTree<T>.Node node2 = this.terminator;
        for (IntervalTree<T>.Node node3 = this.root; node3 != this.terminator; node3 = node.getStart() <= node3.getStart() ? node3.getLeft() : node3.getRight()) {
            node2 = node3;
        }
        node.setParent(node2);
        if (node2 == this.terminator) {
            this.root = node;
        } else if (node.getStart() <= node2.getStart()) {
            node2.setLeft(node);
        } else {
            node2.setRight(node);
        }
        updateNodeData(node);
        rebalance(node);
    }

    public final void clear() {
        this.root = this.terminator;
    }

    public final boolean contains(ui uiVar) {
        return findFirstOverlap(Float.valueOf(((ti) uiVar).a).floatValue(), Float.valueOf(((ti) uiVar).b).floatValue()) != IntervalTreeKt.getEmptyInterval();
    }

    public final Interval<T> findFirstOverlap(float f, float f2) {
        IntervalTree<T>.Node node = this.root;
        IntervalTree<T>.Node node2 = this.terminator;
        if (node != node2 && node != node2) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node remove = arrayList.remove(arrayList.size() - 1);
                if (remove.overlaps(f, f2)) {
                    return remove;
                }
                if (remove.getLeft() != this.terminator && remove.getLeft().getMax() >= f) {
                    arrayList.add(remove.getLeft());
                }
                if (remove.getRight() != this.terminator && remove.getRight().getMin() <= f2) {
                    arrayList.add(remove.getRight());
                }
            }
            arrayList.clear();
        }
        Interval<T> interval = (Interval<T>) IntervalTreeKt.getEmptyInterval();
        interval.getClass();
        return interval;
    }

    public final List<Interval<T>> findOverlaps(float f, float f2, List<Interval<T>> list) {
        IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node remove = arrayList.remove(arrayList.size() - 1);
                if (remove.overlaps(f, f2)) {
                    list.add(remove);
                }
                if (remove.getLeft() != this.terminator && remove.getLeft().getMax() >= f) {
                    arrayList.add(remove.getLeft());
                }
                if (remove.getRight() != this.terminator && remove.getRight().getMin() <= f2) {
                    arrayList.add(remove.getRight());
                }
            }
            arrayList.clear();
        }
        return list;
    }

    public final void forEach$ui_graphics(ui uiVar, ky kyVar) {
        float floatValue = Float.valueOf(((ti) uiVar).a).floatValue();
        float floatValue2 = Float.valueOf(((ti) uiVar).b).floatValue();
        IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node remove = arrayList.remove(arrayList.size() - 1);
                if (remove.overlaps(floatValue, floatValue2)) {
                    kyVar.invoke(remove);
                }
                if (remove.getLeft() != this.terminator && remove.getLeft().getMax() >= floatValue) {
                    arrayList.add(remove.getLeft());
                }
                if (remove.getRight() != this.terminator && remove.getRight().getMin() <= floatValue2) {
                    arrayList.add(remove.getRight());
                }
            }
            arrayList.clear();
        }
    }

    public final Iterator<Interval<T>> iterator() {
        return new IntervalTree$iterator$1(this);
    }

    public final void plusAssign(Interval<T> interval) {
        addInterval(interval.getStart(), interval.getEnd(), interval.getData());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOverlaps$default(IntervalTree intervalTree, ui uiVar, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = new ArrayList();
        }
        return intervalTree.findOverlaps(uiVar, list);
    }

    public final boolean contains(float f) {
        return findFirstOverlap(f, f) != IntervalTreeKt.getEmptyInterval();
    }

    public final List<Interval<T>> findOverlaps(ui uiVar, List<Interval<T>> list) {
        return findOverlaps(Float.valueOf(((ti) uiVar).a).floatValue(), Float.valueOf(((ti) uiVar).b).floatValue(), list);
    }

    public final Interval<T> findFirstOverlap(ui uiVar) {
        return findFirstOverlap(Float.valueOf(((ti) uiVar).a).floatValue(), Float.valueOf(((ti) uiVar).b).floatValue());
    }

    public final void forEach$ui_graphics(float f, float f2, ky kyVar) {
        IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node remove = arrayList.remove(arrayList.size() - 1);
                if (remove.overlaps(f, f2)) {
                    kyVar.invoke(remove);
                }
                if (remove.getLeft() != this.terminator && remove.getLeft().getMax() >= f) {
                    arrayList.add(remove.getLeft());
                }
                if (remove.getRight() != this.terminator && remove.getRight().getMin() <= f2) {
                    arrayList.add(remove.getRight());
                }
            }
            arrayList.clear();
        }
    }
}
