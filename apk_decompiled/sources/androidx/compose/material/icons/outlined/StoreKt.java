package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StoreKt {
    private static ImageVector _store;

    public static final ImageVector getStore(Icons.Outlined outlined) {
        ImageVector imageVector = _store;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Store", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(18.36f, 9.0f, 0.6f, 3.0f);
        e.lineTo(5.04f, 12.0f);
        e.lineToRelative(0.6f, -3.0f);
        e.horizontalLineToRelative(12.72f);
        e.moveTo(20.0f, 4.0f);
        af0.m(e, 4.0f, 4.0f, 2.0f, 16.0f);
        uo.l(e, 20.0f, 4.0f, 20.0f, 7.0f);
        e.lineTo(4.0f, 7.0f);
        r6.A(e, -1.0f, 5.0f, 2.0f, 1.0f);
        r6.D(e, 6.0f, 10.0f, -6.0f, 4.0f);
        r6.D(e, 6.0f, 2.0f, -6.0f, 1.0f);
        uo.t(e, -2.0f, -1.0f, -5.0f);
        bv.y(e, 6.0f, 18.0f, -4.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.j(e, 4.0f, 6.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _store = build;
        build.getClass();
        return build;
    }
}
