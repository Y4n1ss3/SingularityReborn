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
import defpackage.bv;
import defpackage.er;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LaunchKt {
    private static ImageVector _launch;

    public static final ImageVector getLaunch(Icons.TwoTone twoTone) {
        ImageVector imageVector = _launch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Launch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = k4.f(19.0f, 19.0f, 5.0f, 5.0f, 7.0f);
        f.verticalLineTo(3.0f);
        f.horizontalLineTo(5.0f);
        f.curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        f.verticalLineToRelative(14.0f);
        f.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        f.horizontalLineToRelative(14.0f);
        f.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        r6.p(f, -7.0f, -2.0f, 7.0f);
        bv.y(f, 14.0f, 3.0f, 2.0f, 3.59f);
        f.lineToRelative(-9.83f, 9.83f);
        f.lineToRelative(1.41f, 1.41f);
        fc.t(f, 19.0f, 6.41f, 10.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.l(f, 3.0f, -7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _launch = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getLaunch$annotations(Icons.TwoTone twoTone) {
    }
}
