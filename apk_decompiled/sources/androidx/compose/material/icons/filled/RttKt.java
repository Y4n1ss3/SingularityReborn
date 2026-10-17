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
import defpackage.er;
import defpackage.fc;
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RttKt {
    private static ImageVector _rtt;

    public static final ImageVector getRtt(Icons.Filled filled) {
        ImageVector imageVector = _rtt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Rtt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = kf0.b(9.03f, 3.0f, -1.11f, 7.07f, 2.62f);
        b.lineToRelative(0.7f, -4.5f);
        b.horizontalLineToRelative(2.58f);
        b.lineTo(11.8f, 18.43f);
        b.lineTo(9.47f, 18.43f);
        b.lineTo(9.06f, 21.0f);
        kf0.B(b, 7.27f, 0.4f, -2.57f, -2.35f);
        b.lineToRelative(2.0f, -12.86f);
        kf0.B(b, 2.58f, -0.71f, 4.5f, 2.65f);
        r6.C(b, 22.0f, 3.0f, 9.03f, 3.0f);
        b.moveTo(8.0f, 5.0f);
        b.lineTo(4.0f, 5.0f);
        b.lineToRelative(-0.31f, 2.0f);
        gy.n(b, 4.0f, 8.0f, 5.0f);
        b.moveTo(7.39f, 9.0f);
        kf0.B(b, -4.0f, -0.31f, 2.0f, 4.0f);
        fc.B(b, 0.31f, -2.0f, 8.31f, 17.0f);
        uo.n(b, -6.0f, 2.0f, 19.0f, 6.0f);
        fc.B(b, 0.31f, -2.0f, 8.93f, 13.0f);
        kf0.B(b, -6.0f, -0.31f, 2.0f, 6.01f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(b, 0.3f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rtt = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getRtt$annotations(Icons.Filled filled) {
    }
}
