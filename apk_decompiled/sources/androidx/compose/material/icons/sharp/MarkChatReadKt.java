package androidx.compose.material.icons.sharp;

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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MarkChatReadKt {
    private static ImageVector _markChatRead;

    public static final ImageVector getMarkChatRead(Icons.Sharp sharp) {
        ImageVector imageVector = _markChatRead;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MarkChatRead", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.03f, 17.5f);
        b.curveTo(12.01f, 17.67f, 12.0f, 17.83f, 12.0f, 18.0f);
        fc.k(b, 0.0f, 6.0f, -4.0f, 4.0f);
        kf0.r(b, 2.0f, 20.0f, 8.68f);
        b.curveTo(21.09f, 10.25f, 20.08f, 10.0f, 19.0f, 10.0f);
        b.curveToRelative(-3.87f, 0.0f, -7.0f, 3.13f, -7.0f, 7.0f);
        b.curveTo(12.0f, 17.17f, 12.01f, 17.33f, 12.03f, 17.5f);
        k4.x(b, 23.0f, 14.34f, -1.41f, -1.41f);
        b.lineToRelative(-4.24f, 4.24f);
        b.lineToRelative(-2.12f, -2.12f);
        b.lineToRelative(-1.41f, 1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 17.34f, 20.0f, 23.0f, 14.34f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _markChatRead = build;
        build.getClass();
        return build;
    }
}
