package androidx.compose.material.icons.sharp;

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
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FullscreenExitKt {
    private static ImageVector _fullscreenExit;

    public static final ImageVector getFullscreenExit(Icons.Sharp sharp) {
        ImageVector imageVector = _fullscreenExit;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FullscreenExit", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(5.0f, 16.0f, 3.0f, 3.0f, 2.0f);
        bv.n(n, -5.0f, 5.0f, 14.0f, 2.0f);
        n.moveTo(8.0f, 8.0f);
        af0.m(n, 5.0f, 8.0f, 2.0f, 5.0f);
        n.lineTo(10.0f, 5.0f);
        bv.r(n, 8.0f, 5.0f, 3.0f);
        k4.C(n, 14.0f, 19.0f, 2.0f, -3.0f);
        gy.D(n, 3.0f, -2.0f, -5.0f, 5.0f);
        n.moveTo(16.0f, 8.0f);
        fc.w(n, 16.0f, 5.0f, -2.0f, 5.0f);
        n.horizontalLineToRelative(5.0f);
        n.lineTo(19.0f, 8.0f);
        n.horizontalLineToRelative(-3.0f);
        n.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fullscreenExit = build;
        build.getClass();
        return build;
    }
}
