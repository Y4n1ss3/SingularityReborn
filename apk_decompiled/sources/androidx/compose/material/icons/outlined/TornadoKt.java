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
import defpackage.gy;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TornadoKt {
    private static ImageVector _tornado;

    public static final ImageVector getTornado(Icons.Outlined outlined) {
        ImageVector imageVector = _tornado;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Tornado", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = r6.a(23.0f, 3.0f, 1.0f, 11.0f, 19.0f);
        uo.l(a, 23.0f, 3.0f, 19.53f, 5.0f);
        a.lineToRelative(-1.74f, 3.0f);
        a.horizontalLineTo(6.21f);
        a.lineTo(4.47f, 5.0f);
        a.horizontalLineTo(19.53f);
        a.close();
        a.moveTo(10.26f, 15.0f);
        a.horizontalLineToRelative(3.48f);
        r6.C(a, 12.0f, 18.01f, 10.26f, 15.0f);
        a.moveTo(14.9f, 13.0f);
        uo.g(a, 9.1f, -1.74f, -3.0f, 9.27f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(a, 14.9f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tornado = build;
        build.getClass();
        return build;
    }
}
