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
import defpackage.gy;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SanitizerKt {
    private static ImageVector _sanitizer;

    public static final ImageVector getSanitizer(Icons.Sharp sharp) {
        ImageVector imageVector = _sanitizer;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Sanitizer", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.5f, 6.5f);
        b.curveTo(15.5f, 5.66f, 17.0f, 4.0f, 17.0f, 4.0f);
        b.reflectiveCurveToRelative(1.5f, 1.66f, 1.5f, 2.5f);
        b.curveTo(18.5f, 7.33f, 17.83f, 8.0f, 17.0f, 8.0f);
        b.reflectiveCurveTo(15.5f, 7.33f, 15.5f, 6.5f);
        b.close();
        b.moveTo(19.5f, 15.0f);
        b.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        b.curveToRelative(0.0f, -1.67f, -2.5f, -4.5f, -2.5f, -4.5f);
        b.reflectiveCurveTo(17.0f, 10.83f, 17.0f, 12.5f);
        b.curveTo(17.0f, 13.88f, 18.12f, 15.0f, 19.5f, 15.0f);
        r6.B(b, 13.0f, 14.0f, -2.0f, -2.0f);
        af0.o(b, 9.0f, 2.0f, 7.0f, 2.0f);
        af0.v(b, 2.0f, 2.0f, 2.0f, -2.0f);
        uo.r(b, 2.0f, 14.0f, 16.0f, 12.0f);
        gy.i(b, 10.0f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, -2.97f, 2.16f, -5.43f, 5.0f, -5.91f);
        uo.m(b, 4.0f, 7.0f, 2.0f, 6.0f);
        b.curveToRelative(1.13f, 0.0f, 2.15f, 0.39f, 2.99f, 1.01f);
        b.lineToRelative(-1.43f, 1.43f);
        b.curveTo(14.1f, 4.17f, 13.57f, 4.0f, 13.0f, 4.0f);
        b.horizontalLineToRelative(-2.0f);
        b.verticalLineToRelative(2.09f);
        b.curveTo(13.84f, 6.57f, 16.0f, 9.03f, 16.0f, 12.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sanitizer = build;
        build.getClass();
        return build;
    }
}
