package androidx.compose.ui.semantics;

import defpackage.f30;
import defpackage.iy;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsSortKt$UnmergedConfigComparator$1 extends f30 implements my {
    public static final SemanticsSortKt$UnmergedConfigComparator$1 INSTANCE = new SemanticsSortKt$UnmergedConfigComparator$1();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f30 implements iy {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.iy
        public final Float invoke() {
            return Float.valueOf(0.0f);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f30 implements iy {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.iy
        public final Float invoke() {
            return Float.valueOf(0.0f);
        }
    }

    public SemanticsSortKt$UnmergedConfigComparator$1() {
        super(2);
    }

    @Override // defpackage.my
    public final Integer invoke(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return Integer.valueOf(Float.compare(((Number) unmergedConfig$ui.getOrElse(semanticsProperties.getTraversalIndex(), AnonymousClass1.INSTANCE)).floatValue(), ((Number) semanticsNode2.getUnmergedConfig$ui().getOrElse(semanticsProperties.getTraversalIndex(), AnonymousClass2.INSTANCE)).floatValue()));
    }
}
