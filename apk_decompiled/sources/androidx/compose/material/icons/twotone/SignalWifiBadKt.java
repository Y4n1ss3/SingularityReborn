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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SignalWifiBadKt {
    private static ImageVector _signalWifiBad;

    public static final ImageVector getSignalWifiBad(Icons.TwoTone twoTone) {
        ImageVector imageVector = _signalWifiBad;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SignalWifiBad", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(24.0f, 8.98f);
        b.curveTo(20.93f, 5.9f, 16.69f, 4.0f, 12.0f, 4.0f);
        b.curveTo(7.31f, 4.0f, 3.07f, 5.9f, 0.0f, 8.98f);
        af0.m(b, 12.0f, 21.0f, -9.0f, 8.99f);
        uo.l(b, 24.0f, 8.98f, 19.59f, 14.0f);
        b.lineToRelative(-2.09f, 2.09f);
        b.lineToRelative(-0.3f, -0.3f);
        b.lineTo(15.41f, 14.0f);
        b.lineTo(14.0f, 15.41f);
        b.lineToRelative(1.79f, 1.79f);
        b.lineToRelative(0.3f, 0.3f);
        b.lineTo(14.0f, 19.59f);
        b.lineTo(15.41f, 21.0f);
        b.lineToRelative(2.09f, -2.08f);
        b.lineTo(19.59f, 21.0f);
        b.lineTo(21.0f, 19.59f);
        b.lineToRelative(-2.08f, -2.09f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 21.0f, 15.41f, 19.59f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signalWifiBad = build;
        build.getClass();
        return build;
    }
}
