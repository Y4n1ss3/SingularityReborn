package androidx.compose.material.icons.sharp;

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
public final class NearbyErrorKt {
    private static ImageVector _nearbyError;

    public static final ImageVector getNearbyError(Icons.Sharp sharp) {
        ImageVector imageVector = _nearbyError;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NearbyError", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(12.0f, 7.58f, 16.42f, 12.0f);
        i.lineTo(12.0f, 16.42f);
        r6.C(i, 7.58f, 12.0f, 12.0f, 7.58f);
        i.moveTo(12.0f, 19.2f);
        i.lineTo(4.8f, 12.0f);
        i.lineTo(12.0f, 4.8f);
        i.lineToRelative(6.0f, 6.0f);
        i.verticalLineTo(7.17f);
        i.lineToRelative(-5.99f, -5.99f);
        i.lineTo(1.18f, 12.01f);
        i.lineToRelative(10.83f, 10.83f);
        i.lineTo(18.0f, 16.83f);
        bv.k(i, 13.2f, 12.0f, 19.2f);
        k4.C(i, 20.0f, 20.0f, 2.0f, 2.0f);
        uo.r(i, -2.0f, 20.0f, 22.0f, 10.0f);
        i.horizontalLineToRelative(-2.0f);
        i.verticalLineToRelative(8.0f);
        i.horizontalLineToRelative(2.0f);
        i.verticalLineTo(10.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nearbyError = build;
        build.getClass();
        return build;
    }
}
