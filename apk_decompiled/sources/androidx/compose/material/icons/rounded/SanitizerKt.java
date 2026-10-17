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
import defpackage.bv;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SanitizerKt {
    private static ImageVector _sanitizer;

    public static final ImageVector getSanitizer(Icons.Rounded rounded) {
        ImageVector imageVector = _sanitizer;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Sanitizer", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.5f, 6.5f);
        b.curveToRelative(0.0f, -0.56f, 0.67f, -1.49f, 1.11f, -2.04f);
        b.curveToRelative(0.2f, -0.25f, 0.58f, -0.25f, 0.77f, 0.0f);
        b.curveToRelative(0.44f, 0.55f, 1.11f, 1.48f, 1.11f, 2.04f);
        b.curveTo(18.5f, 7.33f, 17.83f, 8.0f, 17.0f, 8.0f);
        b.reflectiveCurveTo(15.5f, 7.33f, 15.5f, 6.5f);
        b.close();
        b.moveTo(19.5f, 15.0f);
        b.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        b.curveToRelative(0.0f, -1.25f, -1.41f, -3.16f, -2.11f, -4.04f);
        b.curveToRelative(-0.2f, -0.25f, -0.57f, -0.25f, -0.77f, 0.0f);
        b.curveTo(18.41f, 9.34f, 17.0f, 11.25f, 17.0f, 12.5f);
        b.curveTo(17.0f, 13.88f, 18.12f, 15.0f, 19.5f, 15.0f);
        r6.B(b, 12.0f, 14.0f, -1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(1.0f);
        b.horizontalLineTo(8.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(0.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(1.0f);
        b.verticalLineToRelative(1.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-1.0f);
        b.horizontalLineToRelative(1.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(0.0f);
        b.curveTo(13.0f, 14.45f, 12.55f, 14.0f, 12.0f, 14.0f);
        bv.v(b, 16.0f, 12.0f, 8.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.horizontalLineTo(6.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.verticalLineToRelative(-8.0f);
        b.curveToRelative(0.0f, -2.97f, 2.16f, -5.43f, 5.0f, -5.91f);
        b.verticalLineTo(4.0f);
        b.horizontalLineTo(8.0f);
        b.curveTo(7.45f, 4.0f, 7.0f, 3.55f, 7.0f, 3.0f);
        b.verticalLineToRelative(0.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(5.0f);
        b.curveToRelative(0.61f, 0.0f, 1.19f, 0.11f, 1.72f, 0.31f);
        b.curveToRelative(0.67f, 0.25f, 0.83f, 1.13f, 0.33f, 1.64f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveTo(14.77f, 4.23f, 14.36f, 4.31f, 14.0f, 4.18f);
        b.curveTo(13.68f, 4.06f, 13.35f, 4.0f, 13.0f, 4.0f);
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
