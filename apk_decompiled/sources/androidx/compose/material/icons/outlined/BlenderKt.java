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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BlenderKt {
    private static ImageVector _blender;

    public static final ImageVector getBlender(Icons.Outlined outlined) {
        ImageVector imageVector = _blender;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Blender", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(16.13f, 15.13f, 18.0f, 3.0f, -4.0f);
        j50.B(k, 2.0f, -4.0f, 1.0f, 5.0f);
        k.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        k.verticalLineToRelative(4.0f);
        k.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        k.horizontalLineToRelative(2.23f);
        k.lineToRelative(0.64f, 4.13f);
        k.curveTo(6.74f, 16.05f, 6.0f, 17.43f, 6.0f, 19.0f);
        k.verticalLineToRelative(1.0f);
        k.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        k.horizontalLineToRelative(8.0f);
        k.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        k.verticalLineToRelative(-1.0f);
        k.curveTo(18.0f, 17.43f, 17.26f, 16.05f, 16.13f, 15.13f);
        fc.A(k, 5.0f, 9.0f, 5.0f, 1.31f);
        gy.w(k, 0.62f, 4.0f, 5.0f);
        k.moveTo(15.67f, 5.0f);
        k.lineToRelative(-1.38f, 9.0f);
        k.horizontalLineTo(9.72f);
        k.lineTo(8.33f, 5.0f);
        k.horizontalLineTo(15.67f);
        k.close();
        k4.A(k, 16.0f, 20.0f, 8.0f, -1.0f);
        k.curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f);
        k.horizontalLineToRelative(2.0f);
        k.curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(k, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(12.0f, 18.0f, -1.0f, 0.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _blender = build;
        build.getClass();
        return build;
    }
}
