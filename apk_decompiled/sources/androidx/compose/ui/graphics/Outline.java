package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class Outline {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Generic extends Outline {
        public static final int $stable = 8;
        private final Path path;

        public Generic(Path path) {
            super(null);
            this.path = path;
        }

        @Override // androidx.compose.ui.graphics.Outline
        public Rect getBounds() {
            return this.path.getBounds();
        }

        public final Path getPath() {
            return this.path;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Rectangle extends Outline {
        public static final int $stable = 0;
        private final Rect rect;

        public Rectangle(Rect rect) {
            super(null);
            this.rect = rect;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Rectangle) && q10.b(this.rect, ((Rectangle) obj).rect);
        }

        @Override // androidx.compose.ui.graphics.Outline
        public Rect getBounds() {
            return this.rect;
        }

        public final Rect getRect() {
            return this.rect;
        }

        public int hashCode() {
            return this.rect.hashCode();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Rounded extends Outline {
        public static final int $stable = 0;
        private final RoundRect roundRect;
        private final Path roundRectPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Rounded(RoundRect roundRect) {
            super(0 == true ? 1 : 0);
            Path path = null;
            this.roundRect = roundRect;
            if (!RoundRectKt.isSimple(roundRect)) {
                Path Path = AndroidPath_androidKt.Path();
                Path.addRoundRect$default(Path, roundRect, null, 2, null);
                path = Path;
            }
            this.roundRectPath = path;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Rounded) && q10.b(this.roundRect, ((Rounded) obj).roundRect);
        }

        @Override // androidx.compose.ui.graphics.Outline
        public Rect getBounds() {
            return RoundRectKt.getBoundingRect(this.roundRect);
        }

        public final RoundRect getRoundRect() {
            return this.roundRect;
        }

        public final Path getRoundRectPath$ui_graphics() {
            return this.roundRectPath;
        }

        public int hashCode() {
            return this.roundRect.hashCode();
        }
    }

    public /* synthetic */ Outline(dq dqVar) {
        this();
    }

    public abstract Rect getBounds();

    private Outline() {
    }
}
