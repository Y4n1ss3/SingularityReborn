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
import defpackage.j50;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EventRepeatKt {
    private static ImageVector _eventRepeat;

    public static final ImageVector getEventRepeat(Icons.TwoTone twoTone) {
        ImageVector imageVector = _eventRepeat;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EventRepeat", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(5.0f, 6.0f, 14.0f, 2.0f, -14.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(21.0f, 12.0f, 6.0f);
        d.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        af0.q(d, -1.0f, 2.0f, -2.0f, 2.0f);
        gy.x(d, 8.0f, 2.0f, 6.0f, 2.0f);
        d.horizontalLineTo(5.0f);
        d.curveTo(3.9f, 4.0f, 3.0f, 4.9f, 3.0f, 6.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gy.o(d, 7.0f, -2.0f, 5.0f, 10.0f);
        kp0.j(d, 14.0f, 2.0f, 21.0f);
        uo.p(d, 19.0f, 8.0f, 5.0f, 6.0f);
        uo.r(d, 14.0f, 8.0f, 15.64f, 20.0f);
        d.curveToRelative(0.43f, 1.45f, 1.77f, 2.5f, 3.36f, 2.5f);
        d.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        d.reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f);
        d.curveToRelative(-0.95f, 0.0f, -1.82f, 0.38f, -2.45f, 1.0f);
        fc.u(d, 1.45f, 0.0f, 18.0f, -4.0f);
        gy.C(d, -4.0f, 1.5f, 0.0f, 1.43f);
        d.curveTo(16.4f, 14.55f, 17.64f, 14.0f, 19.0f, 14.0f);
        d.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        d.reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f);
        d.curveToRelative(-2.42f, 0.0f, -4.44f, -1.72f, -4.9f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(d, 15.64f, 20.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _eventRepeat = build;
        build.getClass();
        return build;
    }
}
