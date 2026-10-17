package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RMobiledataKt {
    private static ImageVector _rMobiledata;

    public static final ImageVector getRMobiledata(Icons.Outlined outlined) {
        ImageVector imageVector = _rMobiledata;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RMobiledata", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = gy.p(7.8f, 7.2f, 9.0f, 10.0f, 7.0f);
        fc.v(p, 5.87f, 7.33f, 4.0f, 10.0f);
        uf.t(p, 2.0f, 2.0f, 5.0f);
        p.curveToRelative(1.13f, 0.0f, 2.0f, 0.87f, 2.0f, 2.0f);
        p.verticalLineToRelative(1.33f);
        p.curveTo(9.0f, 6.13f, 8.47f, 6.87f, 7.8f, 7.2f);
        uo.q(p, 7.0f, 4.0f, 4.0f, 1.33f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(p, 3.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rMobiledata = build;
        build.getClass();
        return build;
    }
}
