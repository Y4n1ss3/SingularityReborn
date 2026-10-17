package androidx.compose.ui.window;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;
import defpackage.y80;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidPopup_androidKt$SimpleStack$1$1 implements MeasurePolicy {
    public static final AndroidPopup_androidKt$SimpleStack$1$1 INSTANCE = new AndroidPopup_androidKt$SimpleStack$1$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int size = list.size();
        if (size == 0) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, AnonymousClass1.INSTANCE, 4, null);
        }
        if (size == 1) {
            Placeable mo6234measureBRTryo0 = list.get(0).mo6234measureBRTryo0(j);
            return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new AnonymousClass2(mo6234measureBRTryo0), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            Placeable mo6234measureBRTryo02 = list.get(i3).mo6234measureBRTryo0(j);
            i = Math.max(i, mo6234measureBRTryo02.getWidth());
            i2 = Math.max(i2, mo6234measureBRTryo02.getHeight());
            arrayList.add(mo6234measureBRTryo02);
        }
        return MeasureScope.layout$default(measureScope, i, i2, null, new AnonymousClass3(arrayList), 4, null);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f30 implements ky {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.ky
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return w01.a;
        }

        public final void invoke(Placeable.PlacementScope placementScope) {
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f30 implements ky {
        final /* synthetic */ Placeable $p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Placeable placeable) {
            super(1);
            this.$p = placeable;
        }

        public final void invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope.placeRelative$default(placementScope, this.$p, 0, 0, 0.0f, 4, null);
        }

        @Override // defpackage.ky
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return w01.a;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends f30 implements ky {
        final /* synthetic */ List<Placeable> $placeables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(List<? extends Placeable> list) {
            super(1);
            this.$placeables = list;
        }

        public final void invoke(Placeable.PlacementScope placementScope) {
            int v = y80.v(this.$placeables);
            if (v < 0) {
                return;
            }
            int i = 0;
            while (true) {
                Placeable.PlacementScope placementScope2 = placementScope;
                Placeable.PlacementScope.placeRelative$default(placementScope2, this.$placeables.get(i), 0, 0, 0.0f, 4, null);
                if (i == v) {
                    return;
                }
                i++;
                placementScope = placementScope2;
            }
        }

        @Override // defpackage.ky
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return w01.a;
        }
    }
}
