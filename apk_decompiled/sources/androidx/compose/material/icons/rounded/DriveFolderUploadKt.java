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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DriveFolderUploadKt {
    private static ImageVector _driveFolderUpload;

    public static final ImageVector getDriveFolderUpload(Icons.Rounded rounded) {
        ImageVector imageVector = _driveFolderUpload;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DriveFolderUpload", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(20.0f, 6.0f, -8.0f, -1.41f, -1.41f);
        i.curveTo(10.21f, 4.21f, 9.7f, 4.0f, 9.17f, 4.0f);
        i.horizontalLineTo(4.0f);
        i.curveTo(2.9f, 4.0f, 2.01f, 4.9f, 2.01f, 6.0f);
        i.lineTo(2.0f, 18.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.verticalLineTo(8.0f);
        i.curveTo(22.0f, 6.9f, 21.1f, 6.0f, 20.0f, 6.0f);
        bv.v(i, 13.0f, 13.0f, 3.0f);
        i.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        i.horizontalLineToRelative(0.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        i.verticalLineToRelative(-3.0f);
        i.horizontalLineTo(9.21f);
        i.curveToRelative(-0.45f, 0.0f, -0.67f, -0.54f, -0.35f, -0.85f);
        i.lineToRelative(2.8f, -2.79f);
        i.curveToRelative(0.2f, -0.2f, 0.51f, -0.19f, 0.71f, 0.0f);
        i.lineToRelative(2.79f, 2.79f);
        i.curveTo(15.46f, 12.46f, 15.24f, 13.0f, 14.8f, 13.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(i, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _driveFolderUpload = build;
        build.getClass();
        return build;
    }
}
