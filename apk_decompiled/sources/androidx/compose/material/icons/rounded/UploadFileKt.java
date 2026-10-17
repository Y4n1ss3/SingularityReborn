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
import defpackage.c21;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UploadFileKt {
    private static ImageVector _uploadFile;

    public static final ImageVector getUploadFile(Icons.Rounded rounded) {
        ImageVector imageVector = _uploadFile;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.UploadFile", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.41f, 7.41f, -4.83f, -4.83f);
        e.curveTo(14.21f, 2.21f, 13.7f, 2.0f, 13.17f, 2.0f);
        e.horizontalLineTo(6.0f);
        e.curveTo(4.9f, 2.0f, 4.01f, 2.9f, 4.01f, 4.0f);
        e.lineTo(4.0f, 20.0f);
        e.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        e.horizontalLineTo(18.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineTo(8.83f);
        e.curveTo(20.0f, 8.3f, 19.79f, 7.79f, 19.41f, 7.41f);
        uo.q(e, 14.8f, 15.0f, 13.0f, 3.0f);
        e.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        e.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        e.verticalLineToRelative(-3.0f);
        e.horizontalLineTo(9.21f);
        e.curveToRelative(-0.45f, 0.0f, -0.67f, -0.54f, -0.35f, -0.85f);
        e.lineToRelative(2.8f, -2.79f);
        e.curveToRelative(0.2f, -0.19f, 0.51f, -0.19f, 0.71f, 0.0f);
        e.lineToRelative(2.79f, 2.79f);
        e.curveTo(15.46f, 14.46f, 15.24f, 15.0f, 14.8f, 15.0f);
        e.close();
        e.moveTo(14.0f, 9.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c21.b(e, 3.5f, 18.5f, 9.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _uploadFile = build;
        build.getClass();
        return build;
    }
}
