package com.topjohnwu.superuser;

import com.topjohnwu.superuser.internal.UiThreadHandler;
import defpackage.zf;
import java.util.AbstractList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class CallbackList<E> extends AbstractList<E> {
    protected List<E> mBase;
    protected Executor mExecutor;

    public CallbackList(Executor executor, List<E> list) {
        this.mExecutor = executor;
        this.mBase = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        List<E> list = this.mBase;
        if (list != null) {
            list.add(i, e);
        }
        this.mExecutor.execute(new zf(0, this, e));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        List<E> list = this.mBase;
        if (list == null) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: onAddElement, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$add$0(E e);

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        List<E> list = this.mBase;
        if (list == null) {
            return null;
        }
        return list.remove(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        List<E> list = this.mBase;
        if (list == null) {
            return null;
        }
        return list.set(i, e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        List<E> list = this.mBase;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public CallbackList(List<E> list) {
        this(UiThreadHandler.executor, list);
    }

    public CallbackList(Executor executor) {
        this(executor, null);
    }

    public CallbackList() {
        this(UiThreadHandler.executor, null);
    }
}
