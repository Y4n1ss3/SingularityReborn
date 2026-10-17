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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LinkedCameraKt {
    private static ImageVector _linkedCamera;

    public static final ImageVector getLinkedCamera(Icons.Sharp sharp) {
        ImageVector imageVector = _linkedCamera;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LinkedCamera", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(12.0f, 14.0f, -3.0f, 0.0f);
        b.arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f);
        b.arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(18.0f, 8.0f, 1.33f);
        a.curveToRelative(0.0f, -1.84f, -1.49f, -3.33f, -3.33f, -3.33f);
        a.lineTo(16.0f, 6.0f);
        a.curveToRelative(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
        k4.r(a, 20.67f, 8.0f, 22.0f, 8.0f);
        a.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        a.verticalLineToRelative(1.33f);
        a.curveToRelative(2.58f, 0.0f, 4.67f, 2.09f, 4.67f, 4.67f);
        k4.r(a, 15.0f, 7.0f, 15.0f, 4.0f);
        a.lineTo(9.0f, 4.0f);
        a.lineTo(7.17f, 6.0f);
        af0.m(a, 2.0f, 6.0f, 16.0f, 20.0f);
        a.lineTo(22.0f, 9.0f);
        a.horizontalLineToRelative(-5.0f);
        a.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        a.close();
        a.moveTo(12.0f, 19.0f);
        a.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        a.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        a.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(a, -2.24f, 5.0f, -5.0f, 5.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _linkedCamera = build;
        build.getClass();
        return build;
    }
}
