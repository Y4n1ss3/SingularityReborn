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
import defpackage.gy;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MobileOffKt {
    private static ImageVector _mobileOff;

    public static final ImageVector getMobileOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _mobileOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MobileOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(17.0f, 5.0f, 8.61f, 2.0f, 2.0f);
        n.verticalLineTo(3.0f);
        n.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        n.horizontalLineTo(7.0f);
        n.curveToRelative(-0.71f, 0.0f, -1.33f, 0.37f, -1.68f, 0.93f);
        kf0.h(n, 8.39f, 5.0f, 17.0f);
        n.moveTo(1.49f, 3.76f);
        n.lineTo(5.0f, 7.27f);
        n.verticalLineTo(21.0f);
        n.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        n.horizontalLineToRelative(10.0f);
        n.curveToRelative(1.02f, 0.0f, 1.85f, -0.77f, 1.98f, -1.75f);
        n.lineToRelative(1.72f, 1.72f);
        n.lineToRelative(1.41f, -1.41f);
        r6.C(n, 2.9f, 2.35f, 1.49f, 3.76f);
        n.moveTo(7.0f, 9.27f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.g(n, 16.73f, 19.0f, 7.0f, 9.27f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mobileOff = build;
        build.getClass();
        return build;
    }
}
