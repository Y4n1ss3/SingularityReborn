package androidx.compose.animation;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import defpackage.f30;
import defpackage.ky;
import defpackage.ny;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContent$6$1$1$1 extends f30 implements ny {
    final /* synthetic */ ContentTransform $specOnEnter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$6$1$1$1(ContentTransform contentTransform) {
        super(3);
        this.$specOnEnter = contentTransform;
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m3invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).m7570unboximpl());
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final MeasureResult m3invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new AnonymousClass1(mo6234measureBRTryo0, this.$specOnEnter), 4, null);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f30 implements ky {
        final /* synthetic */ Placeable $placeable;
        final /* synthetic */ ContentTransform $specOnEnter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Placeable placeable, ContentTransform contentTransform) {
            super(1);
            this.$placeable = placeable;
            this.$specOnEnter = contentTransform;
        }

        public final void invoke(Placeable.PlacementScope placementScope) {
            placementScope.place(this.$placeable, 0, 0, this.$specOnEnter.getTargetContentZIndex());
        }

        @Override // defpackage.ky
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return w01.a;
        }
    }
}
