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
import defpackage.gy;
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FileDownloadOffKt {
    private static ImageVector _fileDownloadOff;

    public static final ImageVector getFileDownloadOff(Icons.Rounded rounded) {
        ImageVector imageVector = _fileDownloadOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FileDownloadOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(9.0f, 6.17f, 4.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.horizontalLineToRelative(4.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        d.verticalLineToRelative(5.0f);
        d.horizontalLineToRelative(1.59f);
        d.curveToRelative(0.89f, 0.0f, 1.33f, 1.08f, 0.7f, 1.71f);
        gy.B(d, -1.88f, 1.88f, 9.0f, 6.17f);
        d.moveTo(20.49f, 20.49f);
        d.lineTo(3.51f, 3.51f);
        d.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        d.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        d.lineToRelative(4.5f, 4.5f);
        d.curveToRelative(-0.26f, 0.37f, -0.28f, 0.91f, 0.1f, 1.28f);
        d.lineToRelative(4.59f, 4.59f);
        d.curveToRelative(0.35f, 0.35f, 0.88f, 0.37f, 1.27f, 0.09f);
        d.lineTo(15.17f, 18.0f);
        d.horizontalLineTo(6.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        d.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(11.17f);
        d.lineToRelative(1.9f, 1.9f);
        d.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        d.curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fileDownloadOff = build;
        build.getClass();
        return build;
    }
}
