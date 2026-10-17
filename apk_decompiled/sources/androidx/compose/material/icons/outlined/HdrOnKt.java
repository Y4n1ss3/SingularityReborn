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
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HdrOnKt {
    private static ImageVector _hdrOn;

    public static final ImageVector getHdrOn(Icons.Outlined outlined) {
        ImageVector imageVector = _hdrOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HdrOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(21.0f, 11.5f, -1.0f);
        h.curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f);
        af0.m(h, 16.0f, 9.0f, 6.0f, 1.5f);
        gy.C(h, -2.0f, 1.1f, 0.9f, 2.0f);
        h.lineTo(21.0f, 15.0f);
        h.lineToRelative(-0.9f, -2.1f);
        h.curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f);
        r6.B(h, 19.5f, 11.5f, -2.0f, -1.0f);
        fc.x(h, 2.0f, 1.0f, 6.5f, 11.0f);
        h.horizontalLineToRelative(-2.0f);
        h.lineTo(4.5f, 9.0f);
        af0.m(h, 3.0f, 9.0f, 6.0f, 1.5f);
        uo.B(h, -2.5f, 2.0f, 6.5f, 15.0f);
        h.lineTo(8.0f, 15.0f);
        h.lineTo(8.0f, 9.0f);
        bv.r(h, 6.5f, 9.0f, 2.0f);
        h.moveTo(13.0f, 9.0f);
        h.lineTo(9.5f, 9.0f);
        h.verticalLineToRelative(6.0f);
        h.lineTo(13.0f, 15.0f);
        h.curveToRelative(0.8f, 0.0f, 1.5f, -0.7f, 1.5f, -1.5f);
        h.verticalLineToRelative(-3.0f);
        h.curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f);
        r6.B(h, 13.0f, 13.5f, -2.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(h, 2.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrOn = build;
        build.getClass();
        return build;
    }
}
