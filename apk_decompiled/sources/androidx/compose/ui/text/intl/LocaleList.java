package androidx.compose.ui.text.intl;

import defpackage.ac;
import defpackage.d41;
import defpackage.dq;
import defpackage.ds0;
import defpackage.n20;
import defpackage.q10;
import defpackage.ut;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LocaleList implements Collection<Locale>, n20 {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final LocaleList Empty = new LocaleList(ut.d);
    private final List<Locale> localeList;
    private final int size;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LocaleList(String str) {
        this(r6);
        List w0 = ds0.w0(str, new String[]{","});
        ArrayList arrayList = new ArrayList(w0.size());
        int size = w0.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(ds0.E0((String) w0.get(i)).toString());
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList2.add(new Locale((String) arrayList.get(i2)));
        }
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public boolean add2(Locale locale) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends Locale> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Locale) {
            return contains((Locale) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.localeList.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocaleList) && q10.b(this.localeList, ((LocaleList) obj).localeList);
    }

    public final Locale get(int i) {
        return this.localeList.get(i);
    }

    public final List<Locale> getLocaleList() {
        return this.localeList;
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.localeList.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.localeList.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<Locale> iterator() {
        return this.localeList.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super Locale> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return d41.J(this);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.localeList + ')';
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final LocaleList getCurrent() {
            return PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent();
        }

        public final LocaleList getEmpty() {
            return LocaleList.Empty;
        }

        private Companion() {
        }
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) d41.K(this, tArr);
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Locale locale) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Locale locale) {
        return this.localeList.contains(locale);
    }

    public LocaleList(List<Locale> list) {
        this.localeList = list;
        this.size = list.size();
    }

    public LocaleList(Locale... localeArr) {
        this((List<Locale>) ac.n0(localeArr));
    }
}
