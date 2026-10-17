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
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HdrOnKt {
    private static ImageVector _hdrOn;

    public static final ImageVector getHdrOn(Icons.TwoTone twoTone) {
        ImageVector imageVector = _hdrOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HdrOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(13.0f, 9.0f, 9.5f, 9.0f, 6.0f);
        s.lineTo(13.0f, 15.0f);
        s.curveToRelative(0.8f, 0.0f, 1.5f, -0.7f, 1.5f, -1.5f);
        s.verticalLineToRelative(-3.0f);
        s.curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f);
        r6.B(s, 13.0f, 13.5f, -2.0f, -3.0f);
        fc.x(s, 2.0f, 3.0f, 21.0f, 11.5f);
        s.verticalLineToRelative(-1.0f);
        s.curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f);
        af0.m(s, 16.0f, 9.0f, 6.0f, 1.5f);
        gy.C(s, -2.0f, 1.1f, 0.9f, 2.0f);
        s.lineTo(21.0f, 15.0f);
        s.lineToRelative(-0.9f, -2.1f);
        s.curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f);
        r6.B(s, 19.5f, 11.5f, -2.0f, -1.0f);
        fc.x(s, 2.0f, 1.0f, 6.5f, 11.0f);
        s.horizontalLineToRelative(-2.0f);
        s.lineTo(4.5f, 9.0f);
        af0.m(s, 3.0f, 9.0f, 6.0f, 1.5f);
        uo.B(s, -2.5f, 2.0f, 6.5f, 15.0f);
        s.lineTo(8.0f, 15.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(s, 8.0f, 9.0f, 6.5f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrOn = build;
        build.getClass();
        return build;
    }
}
