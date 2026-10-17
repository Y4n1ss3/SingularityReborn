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
import defpackage.bv;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DangerousKt {
    private static ImageVector _dangerous;

    public static final ImageVector getDangerous(Icons.Outlined outlined) {
        ImageVector imageVector = _dangerous;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Dangerous", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder l = uf.l(15.73f, 3.0f, 8.27f, 3.0f, 8.27f);
        uo.k(l, 7.46f, 8.27f, 21.0f, 7.46f);
        l.lineTo(21.0f, 15.73f);
        bv.k(l, 8.27f, 15.73f, 3.0f);
        l.moveTo(19.0f, 14.9f);
        l.lineTo(14.9f, 19.0f);
        l.horizontalLineTo(9.1f);
        l.lineTo(5.0f, 14.9f);
        l.verticalLineTo(9.1f);
        l.lineTo(9.1f, 5.0f);
        l.horizontalLineToRelative(5.8f);
        l.lineTo(19.0f, 9.1f);
        l.verticalLineTo(14.9f);
        l.close();
        l.moveTo(14.83f, 7.76f);
        l.lineTo(12.0f, 10.59f);
        l.lineTo(9.17f, 7.76f);
        l.lineTo(7.76f, 9.17f);
        l.lineTo(10.59f, 12.0f);
        l.lineToRelative(-2.83f, 2.83f);
        l.lineToRelative(1.41f, 1.41f);
        l.lineTo(12.0f, 13.41f);
        l.lineToRelative(2.83f, 2.83f);
        l.lineToRelative(1.41f, -1.41f);
        l.lineTo(13.41f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(l, 2.83f, -2.83f, 14.83f, 7.76f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dangerous = build;
        build.getClass();
        return build;
    }
}
