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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExtensionKt {
    private static ImageVector _extension;

    public static final ImageVector getExtension(Icons.Outlined outlined) {
        ImageVector imageVector = _extension;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Extension", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(10.5f, 4.5f);
        b.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        r6.D(b, 2.0f, 6.0f, 6.0f, 2.0f);
        b.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        b.reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f);
        kf0.x(b, -2.0f, 6.0f, -2.12f);
        b.curveToRelative(-0.68f, -1.75f, -2.39f, -3.0f, -4.38f, -3.0f);
        b.reflectiveCurveToRelative(-3.7f, 1.25f, -4.38f, 3.0f);
        b.horizontalLineTo(4.0f);
        b.verticalLineToRelative(-2.12f);
        b.curveToRelative(1.75f, -0.68f, 3.0f, -2.39f, 3.0f, -4.38f);
        b.curveToRelative(0.0f, -1.99f, -1.24f, -3.7f, -2.99f, -4.38f);
        kf0.y(b, 4.0f, 7.0f, 6.0f, 5.0f);
        b.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        b.moveToRelative(0.0f, -2.0f);
        b.curveTo(9.12f, 2.5f, 8.0f, 3.62f, 8.0f, 5.0f);
        b.horizontalLineTo(4.0f);
        b.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        b.verticalLineToRelative(3.8f);
        b.horizontalLineToRelative(0.29f);
        b.curveToRelative(1.49f, 0.0f, 2.7f, 1.21f, 2.7f, 2.7f);
        b.reflectiveCurveToRelative(-1.21f, 2.7f, -2.7f, 2.7f);
        b.horizontalLineTo(2.0f);
        b.verticalLineTo(20.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(3.8f);
        b.verticalLineToRelative(-0.3f);
        b.curveToRelative(0.0f, -1.49f, 1.21f, -2.7f, 2.7f, -2.7f);
        b.reflectiveCurveToRelative(2.7f, 1.21f, 2.7f, 2.7f);
        b.verticalLineToRelative(0.3f);
        b.horizontalLineTo(17.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineToRelative(-4.0f);
        b.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        b.reflectiveCurveTo(20.38f, 11.0f, 19.0f, 11.0f);
        b.verticalLineTo(7.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _extension = build;
        build.getClass();
        return build;
    }
}
