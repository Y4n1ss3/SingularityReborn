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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TapAndPlayKt {
    private static ImageVector _tapAndPlay;

    public static final ImageVector getTapAndPlay(Icons.Filled filled) {
        ImageVector imageVector = _tapAndPlay;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TapAndPlay", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(2.0f, 16.0f, 2.0f);
        h.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        h.horizontalLineToRelative(2.0f);
        h.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        uo.C(h, 2.0f, 20.0f, 3.0f, 3.0f);
        h.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        bv.v(h, 2.0f, 12.0f, 2.0f);
        h.curveToRelative(4.97f, 0.0f, 9.0f, 4.03f, 9.0f, 9.0f);
        h.horizontalLineToRelative(2.0f);
        h.curveToRelative(0.0f, -6.08f, -4.92f, -11.0f, -11.0f, -11.0f);
        k4.r(h, 17.0f, 1.01f, 7.0f, 1.0f);
        h.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        h.verticalLineToRelative(7.37f);
        h.curveToRelative(0.69f, 0.16f, 1.36f, 0.37f, 2.0f, 0.64f);
        fc.w(h, 7.0f, 5.0f, 10.0f, 13.0f);
        h.horizontalLineToRelative(-3.03f);
        h.curveToRelative(0.52f, 1.25f, 0.84f, 2.59f, 0.95f, 4.0f);
        h.lineTo(17.0f, 22.0f);
        h.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        h.lineTo(19.0f, 3.0f);
        h.curveToRelative(0.0f, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tapAndPlay = build;
        build.getClass();
        return build;
    }
}
