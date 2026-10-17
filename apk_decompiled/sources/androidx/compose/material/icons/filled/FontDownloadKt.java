package androidx.compose.material.icons.filled;

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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FontDownloadKt {
    private static ImageVector _fontDownload;

    public static final ImageVector getFontDownload(Icons.Filled filled) {
        ImageVector imageVector = _fontDownload;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FontDownload", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.93f, 13.5f);
        pathBuilder.horizontalLineToRelative(4.14f);
        pathBuilder.lineTo(12.0f, 7.98f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 2.0f);
        pathBuilder.lineTo(4.0f, 2.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(22.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.x(pathBuilder, 15.95f, 18.5f, -1.14f, -3.0f);
        pathBuilder.lineTo(9.17f, 15.5f);
        pathBuilder.lineToRelative(-1.12f, 3.0f);
        pathBuilder.lineTo(5.96f, 18.5f);
        pathBuilder.lineToRelative(5.11f, -13.0f);
        pathBuilder.horizontalLineToRelative(1.86f);
        pathBuilder.lineToRelative(5.11f, 13.0f);
        pathBuilder.horizontalLineToRelative(-2.09f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fontDownload = build;
        build.getClass();
        return build;
    }
}
