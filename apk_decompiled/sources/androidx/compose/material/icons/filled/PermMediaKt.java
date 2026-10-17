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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PermMediaKt {
    private static ImageVector _permMedia;

    public static final ImageVector getPermMedia(Icons.Filled filled) {
        ImageVector imageVector = _permMedia;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PermMedia", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(2.0f, 6.0f, 0.0f, 6.0f, 5.0f);
        s.horizontalLineToRelative(0.01f);
        s.lineTo(0.0f, 20.0f);
        s.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        bv.C(s, 18.0f, -2.0f, 2.0f, 20.0f);
        uo.l(s, 2.0f, 6.0f, 22.0f, 4.0f);
        s.horizontalLineToRelative(-8.0f);
        s.lineToRelative(-2.0f, -2.0f);
        s.lineTo(6.0f, 2.0f);
        s.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        s.lineTo(4.0f, 16.0f);
        s.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        s.horizontalLineToRelative(16.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        s.lineTo(24.0f, 6.0f);
        s.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.x(s, 7.0f, 15.0f, 4.5f, -6.0f);
        s.lineToRelative(3.5f, 4.51f);
        s.lineToRelative(2.5f, -3.01f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(s, 21.0f, 15.0f, 7.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _permMedia = build;
        build.getClass();
        return build;
    }
}
