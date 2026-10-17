package androidx.compose.material.icons.rounded;

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
import defpackage.c21;
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SingleBedKt {
    private static ImageVector _singleBed;

    public static final ImageVector getSingleBed(Icons.Rounded rounded) {
        ImageVector imageVector = _singleBed;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SingleBed", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(18.0f, 10.0f, 7.0f);
        d.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        d.horizontalLineTo(8.0f);
        d.curveTo(6.9f, 5.0f, 6.0f, 5.9f, 6.0f, 7.0f);
        d.verticalLineToRelative(3.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        gy.C(d, 5.0f, 1.33f, 0.51f, 1.53f);
        d.curveTo(5.94f, 18.81f, 6.2f, 19.0f, 6.5f, 19.0f);
        d.horizontalLineToRelative(0.0f);
        d.curveToRelative(0.3f, 0.0f, 0.56f, -0.19f, 0.66f, -0.47f);
        d.lineTo(7.67f, 17.0f);
        d.horizontalLineToRelative(8.67f);
        d.lineToRelative(0.51f, 1.53f);
        d.curveTo(16.94f, 18.81f, 17.2f, 19.0f, 17.5f, 19.0f);
        d.lineToRelative(0.0f, 0.0f);
        d.curveToRelative(0.3f, 0.0f, 0.56f, -0.19f, 0.66f, -0.47f);
        r6.w(d, 18.67f, 17.0f, 20.0f, -5.0f);
        d.curveTo(20.0f, 10.9f, 19.1f, 10.0f, 18.0f, 10.0f);
        c21.d(d, 11.0f, 10.0f, 8.0f, 8.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        uo.r(d, 2.0f, 10.0f, 16.0f, 10.0f);
        af0.f(d, -3.0f, 7.0f, 2.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(d, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _singleBed = build;
        build.getClass();
        return build;
    }
}
