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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DeckKt {
    private static ImageVector _deck;

    public static final ImageVector getDeck(Icons.Outlined outlined) {
        ImageVector imageVector = _deck;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Deck", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(22.0f, 9.0f, 12.0f, 2.0f);
        fc.w(i, 2.0f, 9.0f, 9.0f, 13.0f);
        kf0.v(i, 2.0f, 9.0f, 22.0f);
        i.moveTo(12.0f, 4.44f);
        i.lineTo(15.66f, 7.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.m(i, 8.34f, 12.0f, 4.44f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(4.14f, 12.0f, -1.96f, 0.37f);
        e.lineToRelative(0.82f, 4.37f);
        e.lineToRelative(0.0f, 5.26f);
        e.lineToRelative(2.0f, 0.0f);
        e.lineToRelative(0.02f, -4.0f);
        e.lineToRelative(1.98f, 0.0f);
        e.lineToRelative(0.0f, 4.0f);
        e.lineToRelative(2.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 0.0f, -6.0f, -4.1f, 0.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(19.1f, 16.0f, -4.1f, 0.0f);
        e2.lineToRelative(0.0f, 6.0f);
        e2.lineToRelative(2.0f, 0.0f);
        e2.lineToRelative(0.0f, -4.0f);
        e2.lineToRelative(1.98f, 0.0f);
        e2.lineToRelative(0.02f, 4.0f);
        e2.lineToRelative(2.0f, 0.0f);
        e2.lineToRelative(0.0f, -5.26f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e2, 0.82f, -4.37f, -1.96f, -0.37f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _deck = build;
        build.getClass();
        return build;
    }
}
