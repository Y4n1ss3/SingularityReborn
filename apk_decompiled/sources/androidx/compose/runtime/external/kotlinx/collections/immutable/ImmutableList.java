package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import defpackage.n20;
import defpackage.t;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface ImmutableList<E> extends List<E>, ImmutableCollection<E>, n20 {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SubList<E> extends t implements ImmutableList<E> {
        private int _size;
        private final int fromIndex;
        private final ImmutableList<E> source;
        private final int toIndex;

        /* JADX WARN: Multi-variable type inference failed */
        public SubList(ImmutableList<? extends E> immutableList, int i, int i2) {
            this.source = immutableList;
            this.fromIndex = i;
            this.toIndex = i2;
            ListImplementation.checkRangeIndexes$runtime(i, i2, immutableList.size());
            this._size = i2 - i;
        }

        @Override // defpackage.t, java.util.List
        public E get(int i) {
            ListImplementation.checkElementIndex$runtime(i, this._size);
            return this.source.get(this.fromIndex + i);
        }

        @Override // defpackage.t, defpackage.i
        public int getSize() {
            return this._size;
        }

        @Override // defpackage.t, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
        public ImmutableList<E> subList(int i, int i2) {
            ListImplementation.checkRangeIndexes$runtime(i, i2, this._size);
            ImmutableList<E> immutableList = this.source;
            int i3 = this.fromIndex;
            return new SubList(immutableList, i + i3, i3 + i2);
        }
    }

    @Override // java.util.List
    default ImmutableList<E> subList(int i, int i2) {
        return new SubList(this, i, i2);
    }
}
