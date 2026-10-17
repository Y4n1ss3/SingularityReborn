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
import defpackage.bv;
import defpackage.fc;
import defpackage.j50;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RvHookupKt {
    private static ImageVector _rvHookup;

    public static final ImageVector getRvHookup(Icons.Filled filled) {
        ImageVector imageVector = _rvHookup;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RvHookup", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(20.0f, 17.0f, -6.0f);
        h.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        h.lineTo(7.0f, 9.0f);
        h.lineTo(7.0f, 7.0f);
        h.lineToRelative(-3.0f, 3.0f);
        r6.A(h, 3.0f, 3.0f, -2.0f, 4.0f);
        bv.q(h, 3.0f, 4.0f, 14.0f, 3.0f);
        h.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        h.horizontalLineToRelative(2.0f);
        h.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        h.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        j50.n(h, 8.0f, -2.0f, -2.0f);
        h.moveTo(11.0f, 20.0f);
        h.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        h.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        h.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        h.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        r6.B(h, 18.0f, 14.0f, -4.0f, -3.0f);
        fc.x(h, 4.0f, 3.0f, 17.0f, 2.0f);
        bv.q(h, 2.0f, 9.0f, 4.0f, 2.0f);
        h.horizontalLineToRelative(8.0f);
        h.verticalLineToRelative(2.0f);
        h.lineToRelative(3.0f, -3.0f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rvHookup = build;
        build.getClass();
        return build;
    }
}
