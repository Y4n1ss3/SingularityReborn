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
import defpackage.af0;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContentPasteOffKt {
    private static ImageVector _contentPasteOff;

    public static final ImageVector getContentPasteOff(Icons.Filled filled) {
        ImageVector imageVector = _contentPasteOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ContentPasteOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.19f, 21.19f, 2.81f, 2.81f);
        i.lineTo(1.39f, 4.22f);
        i.lineTo(3.0f, 5.83f);
        i.verticalLineTo(19.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(13.17f);
        gy.B(i, 1.61f, 1.61f, 21.19f, 21.19f);
        i.moveTo(5.0f, 19.0f);
        i.verticalLineTo(7.83f);
        i.lineTo(16.17f, 19.0f);
        i.horizontalLineTo(5.0f);
        i.close();
        kp0.t(i, 17.0f, 8.0f, 5.0f, 2.0f);
        k4.z(i, 11.17f, 2.0f, 2.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.horizontalLineToRelative(-4.18f);
        i.curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f);
        i.reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3.0f);
        i.horizontalLineTo(5.83f);
        i.lineToRelative(5.0f, 5.0f);
        i.horizontalLineTo(17.0f);
        i.close();
        i.moveTo(12.0f, 3.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        i.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        i.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(i, 11.45f, 3.0f, 12.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contentPasteOff = build;
        build.getClass();
        return build;
    }
}
