package androidx.compose.material.icons.automirrored.sharp;

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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MoreKt {
    private static ImageVector _more;

    public static final ImageVector getMore(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _more;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.More", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(24.0f, 3.0f, 6.0f, 3.0f);
        i.lineToRelative(-6.0f, 9.0f);
        i.lineToRelative(6.0f, 9.0f);
        gy.n(i, 18.0f, 24.0f, 3.0f);
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
