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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AttachFileKt {
    private static ImageVector _attachFile;

    public static final ImageVector getAttachFile(Icons.Filled filled) {
        ImageVector imageVector = _attachFile;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AttachFile", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(16.5f, 6.0f, 11.5f);
        h.curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f);
        h.reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f);
        h.verticalLineTo(5.0f);
        h.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        h.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        h.verticalLineToRelative(10.5f);
        h.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        h.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        r6.v(h, 6.0f, 10.0f, 9.5f);
        h.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        h.reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f);
        h.verticalLineTo(5.0f);
        h.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        h.reflectiveCurveTo(7.0f, 2.79f, 7.0f, 5.0f);
        h.verticalLineToRelative(12.5f);
        h.curveToRelative(0.0f, 3.04f, 2.46f, 5.5f, 5.5f, 5.5f);
        h.reflectiveCurveToRelative(5.5f, -2.46f, 5.5f, -5.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.l(h, 6.0f, -1.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _attachFile = build;
        build.getClass();
        return build;
    }
}
