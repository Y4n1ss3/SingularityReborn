package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntSize;
import defpackage.dq;
import defpackage.f30;
import defpackage.ky;
import defpackage.q10;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChangeSize {
    public static final int $stable = 0;
    private final Alignment alignment;
    private final FiniteAnimationSpec<IntSize> animationSpec;
    private final boolean clip;
    private final ky size;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.animation.ChangeSize$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f30 implements ky {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.ky
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return IntSize.m7774boximpl(m45invokemzRDjE0(((IntSize) obj).m7786unboximpl()));
        }

        /* renamed from: invoke-mzRDjE0, reason: not valid java name */
        public final long m45invokemzRDjE0(long j) {
            return IntSize.m7777constructorimpl(0L);
        }
    }

    public /* synthetic */ ChangeSize(Alignment alignment, ky kyVar, FiniteAnimationSpec finiteAnimationSpec, boolean z, int i, dq dqVar) {
        this(alignment, (i & 2) != 0 ? AnonymousClass1.INSTANCE : kyVar, finiteAnimationSpec, (i & 8) != 0 ? true : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeSize copy$default(ChangeSize changeSize, Alignment alignment, ky kyVar, FiniteAnimationSpec finiteAnimationSpec, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            alignment = changeSize.alignment;
        }
        if ((i & 2) != 0) {
            kyVar = changeSize.size;
        }
        if ((i & 4) != 0) {
            finiteAnimationSpec = changeSize.animationSpec;
        }
        if ((i & 8) != 0) {
            z = changeSize.clip;
        }
        return changeSize.copy(alignment, kyVar, finiteAnimationSpec, z);
    }

    public final Alignment component1() {
        return this.alignment;
    }

    public final ky component2() {
        return this.size;
    }

    public final FiniteAnimationSpec<IntSize> component3() {
        return this.animationSpec;
    }

    public final boolean component4() {
        return this.clip;
    }

    public final ChangeSize copy(Alignment alignment, ky kyVar, FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z) {
        return new ChangeSize(alignment, kyVar, finiteAnimationSpec, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) obj;
        return q10.b(this.alignment, changeSize.alignment) && q10.b(this.size, changeSize.size) && q10.b(this.animationSpec, changeSize.animationSpec) && this.clip == changeSize.clip;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final ky getSize() {
        return this.size;
    }

    public int hashCode() {
        return Boolean.hashCode(this.clip) + ((this.animationSpec.hashCode() + ((this.size.hashCode() + (this.alignment.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChangeSize(alignment=");
        sb.append(this.alignment);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", animationSpec=");
        sb.append(this.animationSpec);
        sb.append(", clip=");
        return uf.e(sb, this.clip, ')');
    }

    public ChangeSize(Alignment alignment, ky kyVar, FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z) {
        this.alignment = alignment;
        this.size = kyVar;
        this.animationSpec = finiteAnimationSpec;
        this.clip = z;
    }
}
