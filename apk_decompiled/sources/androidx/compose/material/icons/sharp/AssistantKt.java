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
import defpackage.gy;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AssistantKt {
    private static ImageVector _assistant;

    public static final ImageVector getAssistant(Icons.Sharp sharp) {
        ImageVector imageVector = _assistant;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Assistant", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(21.0f, 2.0f, 3.0f, 2.0f, 18.0f);
        s.horizontalLineToRelative(6.0f);
        s.lineToRelative(3.0f, 3.0f);
        s.lineToRelative(3.0f, -3.0f);
        gy.n(s, 6.0f, 21.0f, 2.0f);
        s.moveTo(13.88f, 12.88f);
        s.lineTo(12.0f, 17.0f);
        s.lineToRelative(-1.88f, -4.12f);
        s.lineTo(6.0f, 11.0f);
        s.lineToRelative(4.12f, -1.88f);
        s.lineTo(12.0f, 5.0f);
        s.lineToRelative(1.88f, 4.12f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(s, 18.0f, 11.0f, -4.12f, 1.88f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _assistant = build;
        build.getClass();
        return build;
    }
}
