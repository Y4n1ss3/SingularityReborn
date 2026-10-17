package androidx.compose.material.icons.twotone;

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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FilterTiltShiftKt {
    private static ImageVector _filterTiltShift;

    public static final ImageVector getFilterTiltShift(Icons.TwoTone twoTone) {
        ImageVector imageVector = _filterTiltShift;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FilterTiltShift", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(13.0f, 2.05f, 2.02f);
        h.curveToRelative(1.46f, 0.18f, 2.79f, 0.76f, 3.9f, 1.62f);
        h.lineToRelative(1.42f, -1.43f);
        h.curveTo(16.84f, 3.05f, 15.01f, 2.25f, 13.0f, 2.05f);
        bv.v(h, 13.0f, 19.93f, 2.02f);
        h.curveToRelative(2.01f, -0.2f, 3.84f, -1.0f, 5.32f, -2.21f);
        h.lineToRelative(-1.43f, -1.43f);
        h.curveToRelative(-1.1f, 0.86f, -2.43f, 1.44f, -3.89f, 1.62f);
        k4.x(h, 4.26f, 18.32f, 1.43f, -1.43f);
        h.curveToRelative(-0.86f, -1.1f, -1.44f, -2.43f, -1.62f, -3.89f);
        h.lineTo(2.05f, 13.0f);
        h.curveToRelative(0.2f, 2.01f, 1.0f, 3.84f, 2.21f, 5.32f);
        af0.l(h, 2.05f, 11.0f, 2.02f);
        h.curveToRelative(0.18f, -1.46f, 0.76f, -2.79f, 1.62f, -3.9f);
        h.lineTo(4.26f, 5.68f);
        h.curveTo(3.05f, 7.16f, 2.25f, 8.99f, 2.05f, 11.0f);
        h.close();
        h.moveTo(18.31f, 7.1f);
        h.curveToRelative(0.86f, 1.11f, 1.44f, 2.44f, 1.62f, 3.9f);
        h.horizontalLineToRelative(2.02f);
        h.curveToRelative(-0.2f, -2.01f, -1.0f, -3.84f, -2.21f, -5.32f);
        uo.l(h, 18.31f, 7.1f, 7.1f, 5.69f);
        h.curveToRelative(1.11f, -0.86f, 2.44f, -1.44f, 3.9f, -1.62f);
        h.lineTo(11.0f, 2.05f);
        h.curveToRelative(-2.01f, 0.2f, -3.84f, 1.0f, -5.32f, 2.21f);
        uo.l(h, 7.1f, 5.69f, 5.68f, 19.74f);
        h.curveTo(7.16f, 20.95f, 9.0f, 21.75f, 11.0f, 21.95f);
        h.verticalLineToRelative(-2.02f);
        h.curveToRelative(-1.46f, -0.18f, -2.79f, -0.76f, -3.9f, -1.62f);
        fc.B(h, -1.42f, 1.43f, 21.95f, 13.01f);
        h.horizontalLineToRelative(-2.02f);
        h.curveToRelative(-0.18f, 1.45f, -0.76f, 2.78f, -1.62f, 3.89f);
        h.lineToRelative(1.43f, 1.43f);
        h.curveToRelative(1.21f, -1.48f, 2.01f, -3.32f, 2.21f, -5.32f);
        h.close();
        h.moveTo(9.0f, 12.0f);
        h.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        h.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        h.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(h, -3.0f, 1.34f, -3.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _filterTiltShift = build;
        build.getClass();
        return build;
    }
}
