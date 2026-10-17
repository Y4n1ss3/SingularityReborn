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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FileOpenKt {
    private static ImageVector _fileOpen;

    public static final ImageVector getFileOpen(Icons.Rounded rounded) {
        ImageVector imageVector = _fileOpen;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FileOpen", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(13.17f, 2.0f, 6.0f);
        d.curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f);
        d.verticalLineToRelative(16.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(9.0f);
        d.verticalLineToRelative(-6.0f);
        d.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        d.horizontalLineToRelative(3.0f);
        d.verticalLineTo(8.83f);
        d.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f);
        d.lineToRelative(-4.83f, -4.83f);
        d.curveTo(14.21f, 2.21f, 13.7f, 2.0f, 13.17f, 2.0f);
        bv.g(d, 13.0f, 8.0f, 3.5f);
        d.lineTo(18.5f, 9.0f);
        d.horizontalLineTo(14.0f);
        d.curveTo(13.45f, 9.0f, 13.0f, 8.55f, 13.0f, 8.0f);
        d.close();
        d.moveTo(22.66f, 17.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.horizontalLineToRelative(-1.24f);
        d.lineToRelative(2.24f, 2.24f);
        d.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        d.lineToRelative(0.0f, 0.0f);
        d.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        d.lineTo(19.0f, 19.41f);
        d.lineToRelative(0.0f, 1.24f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.verticalLineTo(17.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.horizontalLineToRelative(3.66f);
        d.curveTo(22.21f, 16.0f, 22.66f, 16.45f, 22.66f, 17.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fileOpen = build;
        build.getClass();
        return build;
    }
}
