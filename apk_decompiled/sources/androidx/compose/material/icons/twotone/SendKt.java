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
import defpackage.er;
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SendKt {
    private static ImageVector _send;

    public static final ImageVector getSend(Icons.TwoTone twoTone) {
        ImageVector imageVector = _send;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Send", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(4.0f, 8.25f, 7.51f, 1.0f);
        fc.B(e, -7.5f, -3.22f, 4.01f, 17.97f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 7.5f, -3.22f, -7.51f, 1.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(2.01f, 3.0f, 2.0f, 10.0f);
        i.lineToRelative(15.0f, 2.0f);
        i.lineToRelative(-15.0f, 2.0f);
        i.lineToRelative(0.01f, 7.0f);
        r6.C(i, 23.0f, 12.0f, 2.01f, 3.0f);
        i.moveTo(4.0f, 8.25f);
        i.lineTo(4.0f, 6.03f);
        fc.C(i, 7.51f, 3.22f, -7.51f, -1.0f);
        i.moveTo(4.01f, 17.97f);
        i.verticalLineToRelative(-2.22f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(i, 7.51f, -1.0f, -7.51f, 3.22f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _send = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getSend$annotations(Icons.TwoTone twoTone) {
    }
}
