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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FilePresentKt {
    private static ImageVector _filePresent;

    public static final ImageVector getFilePresent(Icons.Rounded rounded) {
        ImageVector imageVector = _filePresent;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FilePresent", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(13.17f, 2.0f, 6.0f);
        d.curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f);
        d.verticalLineToRelative(16.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(12.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(8.83f);
        d.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f);
        d.lineToRelative(-4.83f, -4.83f);
        d.curveTo(14.21f, 2.21f, 13.7f, 2.0f, 13.17f, 2.0f);
        d.close();
        d.moveTo(16.0f, 15.0f);
        d.curveToRelative(0.0f, 2.34f, -2.01f, 4.21f, -4.39f, 3.98f);
        d.curveTo(9.53f, 18.78f, 8.0f, 16.92f, 8.0f, 14.83f);
        d.lineToRelative(0.0f, -5.19f);
        d.curveToRelative(0.0f, -1.31f, 0.94f, -2.5f, 2.24f, -2.63f);
        d.curveTo(11.74f, 6.86f, 13.0f, 8.03f, 13.0f, 9.5f);
        d.verticalLineTo(14.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.horizontalLineToRelative(0.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.verticalLineTo(9.5f);
        d.curveTo(11.0f, 9.22f, 10.78f, 9.0f, 10.5f, 9.0f);
        d.reflectiveCurveTo(10.0f, 9.22f, 10.0f, 9.5f);
        d.verticalLineToRelative(5.39f);
        d.curveToRelative(0.0f, 1.0f, 0.68f, 1.92f, 1.66f, 2.08f);
        d.curveTo(12.92f, 17.18f, 14.0f, 16.21f, 14.0f, 15.0f);
        d.verticalLineToRelative(-3.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.horizontalLineToRelative(0.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        uo.y(d, 15.0f, 14.0f, 7.0f, 4.0f);
        d.lineToRelative(4.0f, 4.0f);
        d.horizontalLineToRelative(-3.0f);
        d.curveTo(14.45f, 8.0f, 14.0f, 7.55f, 14.0f, 7.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _filePresent = build;
        build.getClass();
        return build;
    }
}
