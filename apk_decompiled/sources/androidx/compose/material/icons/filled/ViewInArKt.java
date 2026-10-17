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
import defpackage.bv;
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ViewInArKt {
    private static ImageVector _viewInAr;

    public static final ImageVector getViewInAr(Icons.Filled filled) {
        ImageVector imageVector = _viewInAr;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ViewInAr", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(18.25f, 7.6f, -5.5f, -3.18f);
        e.curveToRelative(-0.46f, -0.27f, -1.04f, -0.27f, -1.5f, 0.0f);
        e.lineTo(5.75f, 7.6f);
        e.curveToRelative(-0.46f, 0.27f, -0.75f, 0.76f, -0.75f, 1.3f);
        e.verticalLineToRelative(6.35f);
        e.curveToRelative(0.0f, 0.54f, 0.29f, 1.03f, 0.75f, 1.3f);
        e.lineToRelative(5.5f, 3.18f);
        e.curveToRelative(0.46f, 0.27f, 1.04f, 0.27f, 1.5f, 0.0f);
        e.lineToRelative(5.5f, -3.18f);
        e.curveToRelative(0.46f, -0.27f, 0.75f, -0.76f, 0.75f, -1.3f);
        e.lineTo(19.0f, 8.9f);
        e.curveToRelative(0.0f, -0.54f, -0.29f, -1.03f, -0.75f, -1.3f);
        bv.v(e, 7.0f, 14.96f, -4.62f);
        e.lineToRelative(4.0f, 2.32f);
        uo.t(e, 4.61f, -4.0f, -2.31f);
        e.moveTo(12.0f, 10.93f);
        e.lineTo(8.0f, 8.61f);
        e.lineToRelative(4.0f, -2.31f);
        fc.C(e, 4.0f, 2.31f, -4.0f, 2.32f);
        e.moveTo(13.0f, 17.27f);
        j50.A(e, -4.61f, 4.0f, -2.32f, 4.62f);
        fc.B(e, -4.0f, 2.31f, 7.0f, 2.0f);
        e.lineTo(3.5f, 2.0f);
        e.curveTo(2.67f, 2.0f, 2.0f, 2.67f, 2.0f, 3.5f);
        e.lineTo(2.0f, 7.0f);
        uo.n(e, 2.0f, 4.0f, 4.0f, 3.0f);
        uo.l(e, 7.0f, 2.0f, 17.0f, 2.0f);
        e.horizontalLineToRelative(3.5f);
        e.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        e.lineTo(22.0f, 7.0f);
        uo.n(e, -2.0f, 20.0f, 4.0f, -3.0f);
        uo.l(e, 17.0f, 2.0f, 7.0f, 22.0f);
        e.lineTo(3.5f, 22.0f);
        e.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        fc.w(e, 2.0f, 17.0f, 2.0f, 3.0f);
        fc.x(e, 3.0f, 2.0f, 17.0f, 22.0f);
        e.horizontalLineToRelative(3.5f);
        e.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        fc.w(e, 22.0f, 17.0f, -2.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(e, -3.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _viewInAr = build;
        build.getClass();
        return build;
    }
}
