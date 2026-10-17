package androidx.compose.material.icons.automirrored.filled;

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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MoreKt {
    private static ImageVector _more;

    public static final ImageVector getMore(Icons.AutoMirrored.Filled filled) {
        ImageVector imageVector = _more;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.More", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(22.0f, 3.0f, 7.0f, 3.0f);
        i.curveToRelative(-0.69f, 0.0f, -1.23f, 0.35f, -1.59f, 0.88f);
        i.lineTo(0.0f, 12.0f);
        i.lineToRelative(5.41f, 8.11f);
        i.curveToRelative(0.36f, 0.53f, 0.97f, 0.89f, 1.66f, 0.89f);
        i.lineTo(22.0f, 21.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(24.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.close();
        i.moveTo(9.0f, 13.5f);
        i.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        i.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        i.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        i.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        i.close();
        i.moveTo(14.0f, 13.5f);
        i.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        i.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        i.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        i.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        i.close();
        i.moveTo(19.0f, 13.5f);
        i.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        i.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        i.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -0.67f, 1.5f, -1.5f, 1.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _more = build;
        build.getClass();
        return build;
    }
}
