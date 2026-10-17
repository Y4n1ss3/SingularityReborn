package androidx.compose.runtime;

import defpackage.yi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class AbstractApplier<T> implements Applier<T> {
    public static final int $stable = 8;
    private T current;
    private final T root;
    private final ArrayList<T> stack = Stack.m3862constructorimpl$default(null, 1, null);

    public AbstractApplier(T t) {
        this.root = t;
        this.current = t;
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        Stack.m3860clearimpl(this.stack);
        setCurrent(this.root);
        onClear();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(T t) {
        Stack.m3872pushimpl(this.stack, getCurrent());
        setCurrent(t);
    }

    @Override // androidx.compose.runtime.Applier
    public T getCurrent() {
        return this.current;
    }

    public final T getRoot() {
        return this.root;
    }

    public final void move(List<T> list, int i, int i2, int i3) {
        int i4 = i > i2 ? i2 : i2 - i3;
        if (i3 != 1) {
            List<T> subList = list.subList(i, i3 + i);
            ArrayList J0 = yi.J0(subList);
            subList.clear();
            list.addAll(i4, J0);
            return;
        }
        if (i == i2 + 1 || i == i2 - 1) {
            list.set(i, list.set(i2, list.get(i)));
        } else {
            list.add(i4, list.remove(i));
        }
    }

    public abstract void onClear();

    public final void remove(List<T> list, int i, int i2) {
        if (i2 == 1) {
            list.remove(i);
        } else {
            list.subList(i, i2 + i).clear();
        }
    }

    public void setCurrent(T t) {
        this.current = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.Applier
    public void up() {
        setCurrent(Stack.m3871popimpl(this.stack));
    }
}
