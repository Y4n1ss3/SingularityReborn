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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PinInvokeKt {
    private static ImageVector _pinInvoke;

    public static final ImageVector getPinInvoke(Icons.TwoTone twoTone) {
        ImageVector imageVector = _pinInvoke;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PinInvoke", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(22.0f, 12.0f, 6.0f);
        h.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        h.horizontalLineTo(4.0f);
        h.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        h.verticalLineTo(6.0f);
        h.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        r6.t(h, 10.0f, 0.0f, 2.0f, 4.0f);
        fc.y(h, 12.0f, 16.0f, -6.0f, 22.0f);
        h.moveTo(22.0f, 7.0f);
        h.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        h.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        h.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        h.curveTo(20.66f, 10.0f, 22.0f, 8.66f, 22.0f, 7.0f);
        k4.x(h, 11.47f, 12.12f, -2.83f, 2.83f);
        h.lineToRelative(1.41f, 1.41f);
        h.lineToRelative(2.83f, -2.83f);
        uf.u(h, 15.0f, 15.66f, 10.0f, 9.34f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(h, 11.47f, 12.12f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinInvoke = build;
        build.getClass();
        return build;
    }
}
