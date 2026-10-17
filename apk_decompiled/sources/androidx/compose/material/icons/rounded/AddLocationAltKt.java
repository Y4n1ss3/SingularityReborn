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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddLocationAltKt {
    private static ImageVector _addLocationAlt;

    public static final ImageVector getAddLocationAlt(Icons.Rounded rounded) {
        ImageVector imageVector = _addLocationAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AddLocationAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.0f, 0.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(2.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineToRelative(-2.0f);
        b.verticalLineToRelative(2.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineTo(5.0f);
        b.horizontalLineToRelative(-2.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(2.0f);
        b.verticalLineTo(1.0f);
        b.curveTo(18.0f, 0.45f, 18.45f, 0.0f, 19.0f, 0.0f);
        b.close();
        b.moveTo(12.0f, 12.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveTo(10.9f, 12.0f, 12.0f, 12.0f);
        b.close();
        b.moveTo(14.72f, 2.47f);
        b.curveTo(14.28f, 2.83f, 14.0f, 3.38f, 14.0f, 4.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(1.0f);
        b.verticalLineToRelative(1.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.curveToRelative(0.32f, 0.0f, 0.62f, -0.08f, 0.89f, -0.21f);
        b.curveTo(19.96f, 9.24f, 20.0f, 9.71f, 20.0f, 10.2f);
        b.curveToRelative(0.0f, 3.18f, -2.45f, 6.92f, -7.34f, 11.23f);
        b.curveToRelative(-0.38f, 0.33f, -0.95f, 0.33f, -1.33f, 0.0f);
        b.curveTo(6.45f, 17.12f, 4.0f, 13.38f, 4.0f, 10.2f);
        b.curveTo(4.0f, 5.22f, 7.8f, 2.0f, 12.0f, 2.0f);
        b.curveTo(12.94f, 2.0f, 13.86f, 2.16f, 14.72f, 2.47f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addLocationAlt = build;
        build.getClass();
        return build;
    }
}
